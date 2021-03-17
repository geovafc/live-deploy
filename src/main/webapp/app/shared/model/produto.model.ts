export interface IProduto {
  id?: number;
  nome?: string;
  valor?: number;
  descricao?: string;
}

export class Produto implements IProduto {
  constructor(public id?: number, public nome?: string, public valor?: number, public descricao?: string) {}
}
