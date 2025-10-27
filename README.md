# FinHero - FIAP

## Configuração de Secrets para GitHub Actions

### Para SonarCloud (Opcional)

1. Vá para o seu repositório no GitHub
2. Clique em **Settings** → **Secrets and variables** → **Actions**
3. Adicione o secret:
   - `SONAR_TOKEN` - Seu token do SonarCloud ([gerar token aqui](https://sonarcloud.io/account/security))

4. Configure no settings.yml:
```yaml
sonarcloud:
  enabled: true
  organization: "sua-organizacao"
  project_key: "seu-projeto-key"
```

### Para Docker Hub

1. Vá para o seu repositório no GitHub
2. Clique em **Settings** → **Secrets and variables** → **Actions**
3. Adicione os seguintes secrets:
   - `DOCKERHUB_USERNAME` - Seu username do Docker Hub
   - `DOCKERHUB_TOKEN` - Seu token do Docker Hub ([gerar token aqui](https://hub.docker.com/settings/security))

### Configuração no settings.yml

```yaml
docker:
  name: "finhero-app"
  tag: "latest"
  registry: "docker.io"  # ou "ghcr.io" para GitHub Container Registry
  username: "seu-dockerhub-username"  # Deixe vazio para GHCR
```

### Para GitHub Container Registry (GHCR)

Não precisa adicionar secrets extras, o workflow usa automaticamente o `GITHUB_TOKEN`.

Configure no settings.yml:
```yaml
docker:
  registry: "ghcr.io"
  username: ""  # Deixe vazio
```
