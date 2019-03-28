package com.xxl.job.admin;

import com.xxl.job.admin.core.model.XxlJobLog;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication

public class XxlJobAdminApplication {

	private static Logger logger = LoggerFactory.getLogger(XxlJobAdminApplication.class);
	public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
        logger.info("-------------sunshine调度中心启动完成---------------------");
	}

}