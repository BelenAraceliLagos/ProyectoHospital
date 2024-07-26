package cl.praxis.ProyectoHospitalPostPandemia;
import io.lsn.logger.factory.LoggerFactory;
import io.lsn.logger.factory.logger.Logger;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInicializer extends SpringBootServletInitializer{
    private static final Logger logger = LoggerFactory.getLogger(ProyectoHospitalPostPandemiaApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.warn("Iniciando Servlet...");
        return application.sources(ProyectoHospitalPostPandemiaApplication.class);
    }
}