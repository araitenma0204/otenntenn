package curriculum_33;

public class Vehicle {
	
	private String owner;
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

}

//メモ↓

//ownerの型をStringからPersonに変更する
//→ 所有者を名前だけでなくPersonオブジェクトとして管理できるようになる

//setOwnerメソッドの引数もPerson型に変更する
//→ Personオブジェクトを直接渡して所有者情報を正確にセット可能になる

//getOwnerメソッドもPerson型で用意する（必要なら）
//→ 所有者の詳細情報（名前以外も）を取得できるようになる
