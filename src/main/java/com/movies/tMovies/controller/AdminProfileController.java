package com.movies.tMovies.controller;

import com.movies.tMovies.dto.AdminProfileInfoDto;
import com.movies.tMovies.entity.AdminProfileInfoEntity;
import com.movies.tMovies.mapper.AdminProfileInfoMapper;
import com.movies.tMovies.service.Impl.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class AdminProfileController {

    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    private final AdminProfileInfoMapper adminProfileInfoMapper;

    @GetMapping("/admin/profile/table")
    public String getAdminProfile(Model model){
        model.addAttribute("getAdminMainProfile",adminProfileInfoService.getAll());
        return "admin-profile-table";
    }

    @GetMapping("/delete/admin/info/{id}")
    public String deleteAdminInfo(@PathVariable("id") Long id){
        adminProfileInfoService.deleteAdminInfo(id);
        return "redirect: /admin/profile/table";
    }

    @GetMapping("/edit/admin/profile/{id}")
    public String editAdminProfile(@PathVariable("id") Long id,Model model){
        model.addAttribute("adminProfileInfo",adminProfileInfoService.findAdminInfoById(id));
        return "edit-adminprofile-data";
    }

    @GetMapping("/admin/profile-edit/{id}")
    public String editingProfileAdmin(@PathVariable("id") Long id,
                                      @ModelAttribute("adminProfileInfoEntity")AdminProfileInfoEntity
                                              adminProfileInfoEntity) {

        AdminProfileInfoDto adminProfileInfoDto = adminProfileInfoService.findAdminInfoById(id);
        AdminProfileInfoEntity adminEntity = adminProfileInfoMapper.fromDTO(adminProfileInfoDto);
        adminEntity.setProfileId(id);
        adminEntity.setAdminName(adminProfileInfoEntity.getAdminName());
        adminEntity.setAdminEmail(adminProfileInfoEntity.getAdminEmail());
        adminEntity.setAdminDeveloper(adminProfileInfoEntity.getAdminDeveloper());
        adminEntity.setAdminProfile(adminProfileInfoEntity.getAdminProfile());
        adminEntity.setAdminProject(adminProfileInfoEntity.getAdminProject());
        adminEntity.setAdminPanel(adminProfileInfoEntity.getAdminPanel());
        adminProfileInfoService.saveAdminInfo(adminEntity);
        return "redirect:/admin/profile/table";
    }
}
