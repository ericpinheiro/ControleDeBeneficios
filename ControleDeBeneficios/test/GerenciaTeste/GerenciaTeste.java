package GerenciaTeste;

import PERS.GerenciaPERS;
import RN.GerenciaRN;
import VO.GerenciaVO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Eric
 * @authorAndressa
 * @author Jean_H_xD
 */
public class GerenciaTeste {

    public GerenciaTeste() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

}
