package com.care.root;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.member.controller.MemberController;
import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

/*
 junit : test �����ϱ� ���� �����ӿ�ũ(��ɵ��� ����) 
 test �ֵ� ����
 ���� �׽�Ʈ, ���� �׽�Ʈ
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:testMember.xml", 
									"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TestMember {
	
	
	@Autowired MemberController mc;
	@Test
	public void testMc() {
		// �ش� ���� null�� �ƴϸ� ����
		// ���� �ش� ���� null�̸� ����
		System.out.println(mc);
		assertNotNull(mc);
	}
	
	@Autowired MemberService ms;
	@Test
	public void testMs() {
		assertNotNull(ms);
	}

	@Autowired MemberDAO dao;
	@Test
	public void testDao() {
		assertNotNull(dao);
		MemberDTO dto = new MemberDTO();
		dto.setId(111);
		dto.setName("ȫ�浿");
		int result = dao.insertMember(dto);
		System.out.println("result : " + result);
		assertEquals(result, 1);
	}
	
	@Autowired MemberDAO dao02;
	@Test
	public void testDao02() {
		assertNotNull(dao);
		MemberDTO dto = new MemberDTO();
	      dto.setId(222);
	      dto.setName("��¼��");
	      int result = ms.insertMember(dto);
	      System.out.println("result:"+result);
	      assertEquals(result, 1);
	}
	
}