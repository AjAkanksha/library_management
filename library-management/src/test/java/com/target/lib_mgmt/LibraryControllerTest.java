/*package com.target.lib_mgmt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.target.lib_mgmt.model.BooksEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(LibraryController.class)
public class LibraryControllerTest extends AbstractTest {

	@Autowired
    private MockMvc mvc;
	
    @MockBean
    BooksServiceImpl serviceImpl;
    
    //private List<BooksEntity> booksentity;
    
    @Test
    public void viewBooks()
      throws Exception {
        
        BooksEntity booksentity = BooksEntity.builder().bookname("DBMS").build();
        
       Mockito.when(serviceImpl.search("DBMS").thenReturn(booksentity);
       // given(serviceImpl.search("DBMS")).willReturn(booksentity);
        mvc.perform(get("/search/DBMS").contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.bookname", is("DBMS")));
    }

}
*/