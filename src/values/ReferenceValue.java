package values;

import plataformarol.StoredSymbol;

public class ReferenceValue implements IReturnValue {
	protected StoredSymbol reference;

	@Override
	public ReturnValueTypes getType() {
		return ReturnValueTypes.REFERENCE;
	}
	
	public ReferenceValue(StoredSymbol reference) {
		this.reference = reference;
	}

	public StoredSymbol getReference() {
		return reference;
	}

	public void setReference(StoredSymbol reference) {
		this.reference = reference;
	}

	@Override
	public IReturnValue add(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue sub(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue mul(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue div(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue eq(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue neq(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue greq(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue leseq(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue great(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue less(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue and(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue or(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue negative() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue not() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue dice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue multDice(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue exponent(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue getFromIndex(IReturnValue another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReturnValue cloneValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTrue() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDepth() {
		return 0;
	}
}
