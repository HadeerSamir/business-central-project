package com.trials.javacallfromdmn;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CurrencyDTO {
    
    private String code;
	
	private boolean stfoSettlementAllowed;
	
	private boolean swiftSettlementAllowed;
	
	public CurrencyDTO() {
		
	}
	
	public CurrencyDTO(String code, boolean stfoSettlementAllowed, boolean swiftSettlementAllowed) {
		this.code = code;
		this.stfoSettlementAllowed = stfoSettlementAllowed;
		this.swiftSettlementAllowed = swiftSettlementAllowed;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isStfoSettlementAllowed() {
		return stfoSettlementAllowed;
	}

	public void setStfoSettlementAllowed(boolean stfoSettlementAllowed) {
		this.stfoSettlementAllowed = stfoSettlementAllowed;
	}

	public boolean isSwiftSettlementAllowed() {
		return swiftSettlementAllowed;
	}

	public void setSwiftSettlementAllowed(boolean swiftSettlementAllowed) {
		this.swiftSettlementAllowed = swiftSettlementAllowed;
	}

}