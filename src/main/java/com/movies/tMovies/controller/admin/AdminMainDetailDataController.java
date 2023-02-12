package com.movies.tMovies.controller.admin;

import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesMainDetailEntity;
import com.movies.tMovies.mapper.TMoviesMainDetailMapper;
import com.movies.tMovies.service.admin.AdminMainDetailServiceImpl;
import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminMainDetailDataController {

    private final AdminMainDetailServiceImpl adminMainDetailService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    private final TMoviesMainDetailMapper tMoviesMainDetailMapper;

    @GetMapping("/table/datatable/basic")
    public String getAdminDataTable(Model model){
    model.addAttribute("mainDetailData",adminMainDetailService.getAllData());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "table-datatable-basic";
    }

    @GetMapping("/create/maindetail-data")
    public String createMainDetail(Model model){
        TMoviesMainDetailEntity tMoviesMainDetailEntity = new TMoviesMainDetailEntity();
        model.addAttribute("mainDetail",tMoviesMainDetailEntity);
        return "create-tmoviesmaindetail-data";
    }

    @PostMapping("/save/new-maindetail-data")
    public String saveTMoviesData(@ModelAttribute("tMoviesMainDetailEntity") TMoviesMainDetailEntity tMoviesMainDetailEntity, Model model){
        TMoviesMainDetailDto mainDetailDto = adminMainDetailService.saveMainDetail(tMoviesMainDetailEntity);
        model.addAttribute("saveData",mainDetailDto);
        return "redirect:/admin/table/datatable/basic";
    }

    @GetMapping("/delete/detail/by/{id}")
    public String deleteById(@PathVariable("id") Long id){
       adminMainDetailService.deleteMainDetail(id);
        return "redirect:/admin/table/datatable/basic";
    }

    @GetMapping("/maindetail/edit/{id}")
    public String editMovieById(@PathVariable("id") Long id, Model model){
        model.addAttribute("editmaindetail",adminMainDetailService.findMainDetailById(id));
        return "edit-tmoviesmaindetail-data";
    }

    @PostMapping("/detail/save/{id}")
    public String editMainMovie(@PathVariable("id")Long id,
                                @ModelAttribute("tMoviesMainDetailEntity")TMoviesMainDetailEntity tMoviesMainDetailEntity) {
        TMoviesMainDetailDto tMoviesMainDetailDto = adminMainDetailService.findMainDetailById(id);
        TMoviesMainDetailEntity tMoviesMainDetail = tMoviesMainDetailMapper.fromDTO(tMoviesMainDetailDto);
        tMoviesMainDetail.setId(id);
        tMoviesMainDetail.setTMoviesLogo(tMoviesMainDetailEntity.getTMoviesLogo());
        tMoviesMainDetail.setTMoviesWord(tMoviesMainDetailEntity.getTMoviesWord());
        tMoviesMainDetail.setTMoviesFooterBackground(tMoviesMainDetailEntity.getTMoviesFooterBackground());
        tMoviesMainDetail.setTMoviesFooterHome(tMoviesMainDetailEntity.getTMoviesFooterHome());
        tMoviesMainDetail.setTMoviesFooterContact(tMoviesMainDetailEntity.getTMoviesFooterContact());
        tMoviesMainDetail.setTMoviesFooterService(tMoviesMainDetailEntity.getTMoviesFooterService());
        tMoviesMainDetail.setTMoviesFooterAbout(tMoviesMainDetailEntity.getTMoviesFooterAbout());
        tMoviesMainDetail.setTMoviesFooterLive(tMoviesMainDetailEntity.getTMoviesFooterLive());
        tMoviesMainDetail.setTMoviesFooterFaq(tMoviesMainDetailEntity.getTMoviesFooterFaq());
        tMoviesMainDetail.setTMoviesFooterPremium(tMoviesMainDetailEntity.getTMoviesFooterPremium());
        tMoviesMainDetail.setTMoviesFooterMustWatch(tMoviesMainDetailEntity.getTMoviesFooterMustWatch());
        tMoviesMainDetail.setTMoviesFooterRelease(tMoviesMainDetailEntity.getTMoviesFooterRelease());
        tMoviesMainDetail.setTMoviesFooterTopImdb(tMoviesMainDetailEntity.getTMoviesFooterTopImdb());
        tMoviesMainDetail.setTvSeriesParalaxBackground(tMoviesMainDetailEntity.getTvSeriesParalaxBackground());
        tMoviesMainDetail.setTvSeriesParalaxLuna(tMoviesMainDetailEntity.getTvSeriesParalaxLuna());
        tMoviesMainDetail.setTvSeriesParalaxNub1(tMoviesMainDetailEntity.getTvSeriesParalaxNub1());
        tMoviesMainDetail.setTvSeriesParalaxNube2(tMoviesMainDetailEntity.getTvSeriesParalaxNube2());
        tMoviesMainDetail.setTvSeriesParalaxJet(tMoviesMainDetailEntity.getTvSeriesParalaxJet());
        tMoviesMainDetail.setTvSeriesParalaxIronman(tMoviesMainDetailEntity.getTvSeriesParalaxIronman());
        tMoviesMainDetail.setMoviesHeader(tMoviesMainDetailEntity.getMoviesHeader());
        adminMainDetailService.saveMainDetail(tMoviesMainDetail);
        return "redirect:/admin/table/datatable/basic";

    }

}
