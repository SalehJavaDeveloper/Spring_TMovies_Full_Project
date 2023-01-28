package com.movies.tMovies.controller;

import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.entity.CardInfoEntity;
import com.movies.tMovies.service.Impl.CardInfoImpl;
import lombok.RequiredArgsConstructor;
import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class CardLoginController {
    private final CardInfoImpl cardInfo;
    @GetMapping("/card-info")
    public String getCardInfo(Model model){
        CardInfoEntity cardInfoEntity = new CardInfoEntity();
        model.addAttribute("cardInfo",cardInfoEntity);
        return "card";
    }

    @RequestMapping(value = "/saveCardInfo", method = {RequestMethod.GET})
    public String saveCardInfo(@ModelAttribute("cardInfo")CardInfoEntity cardInfoEntity, Model model){
       cardInfoEntity.setCardHolder(WordUtils.capitalizeFully(cardInfoEntity.getCardHolder()));
      if(cardInfoEntity.getCashCard() == 12) {
          CardInfoDto cardInfoDto = cardInfo.saveCardInfo(cardInfoEntity);
          model.addAttribute("savecardinfo",cardInfoDto);
          return "substraction-30day";
      } else if (cardInfoEntity.getCashCard() == 24) {
          CardInfoDto cardInfoDto = cardInfo.saveCardInfo(cardInfoEntity);
          model.addAttribute("savecardinfo",cardInfoDto);
          return "substraction-60day";
      } else if (cardInfoEntity.getCashCard() == 36) {
          CardInfoDto cardInfoDto = cardInfo.saveCardInfo(cardInfoEntity);
          model.addAttribute("savecardinfo",cardInfoDto);
          return "substraction-90day";
      } else{
          return "page-error-503";
      }
    }
}
