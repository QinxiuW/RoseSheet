package com.rose.provider.test;

import com.rose.provider.domain.Album;
import com.rose.provider.mapper.IAlbumMapper;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SheetTest {
  @Resource
  private IAlbumMapper albumMapper;

//  private static final Logger LOGGER = LoggerFactory.getLogger(SheetTest.class);

  @Test
  public void albumTest(){

    System.out.println(("----- album test ------"));
    albumMapper.insert(Album.builder().albumName("555").build());
    albumMapper.insert(Album.builder().albumName("666").build());
    List<Album> albums = albumMapper.selectList(null);
    albums.forEach(System.out::println);
  }

}

