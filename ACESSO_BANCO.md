# Acesso ao Banco de Dados - FinHero

## Informações de Conexão

- **Tipo de Banco**: PostgreSQL 16
- **Host**: localhost
- **Porta**: 5432
- **Database**: finhero_db
- **Usuário**: postgres
- **Senha**: postgres

## Comandos para Acessar

### Via Docker (Recomendado)
```bash
docker exec -it finhero-db psql -U postgres -d finhero_db
```

### Via psql local
```bash
psql -h localhost -U postgres -d finhero_db
```

### String de Conexão JDBC
```
jdbc:postgresql://localhost:5432/finhero_db
```

## Tabelas do Sistema

- `users` - Usuários do sistema
- `transactions` - Transações financeiras
- `duplas` - Relacionamentos entre usuários
- `categories` - Categorias de transações

## Comandos Úteis

### Listar todas as tabelas
```sql
\dt
```

### Ver estrutura de uma tabela
```sql
\d users
\d transactions
\d duplas
\d categories
```

### Ver todos os usuários
```sql
SELECT id, email, invite_code, created_at FROM users;
```

### Ver todas as transações
```sql
SELECT * FROM transactions ORDER BY created_at DESC;
```

### Ver duplas
```sql
SELECT * FROM duplas;
```

### Ver categorias
```sql
SELECT * FROM categories;
```

## Monitorar Logs do Backend

Os logs do backend estão sendo salvos em:
```bash
tail -f /tmp/finhero-backend.log
```

Para ver logs em tempo real:
```bash
tail -f /tmp/finhero-backend.log | grep -E "(INFO|ERROR|WARN)"
```

