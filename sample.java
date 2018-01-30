public void deleteContact() {
		System.out.println("삭제할 대상: ");
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		Contact contact = contactBook[ix];
		sc.nextLine(); //??
		
		if(ix >=0 && ix < BOOK_SIZE) {
			System.out.println(contact.getName() + "을 정말 삭제할까요?[y/n]");
			String response = sc.nextLine();
			if(response.equals("y")){
				contactBook[ix] = null;
			}
			
		}else {
			System.out.println("유효하지 않은 번호입니다.");
		}
	}
