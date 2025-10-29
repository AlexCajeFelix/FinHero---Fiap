# Planejamento: Frontend React Gamificado para FinHero

**Tipo:** Aplicação Web Frontend  
**Complexidade:** Alta  
**Tempo Estimado:** 120-160 horas  
**Versão:** 1.0  
**Data:** 2025-01-27

## 🎯 Objetivo

Desenvolver um frontend React moderno, gamificado, estiloso e com modo dark para o FinHero - uma aplicação de gestão financeira colaborativa que permite a usuários formarem "duplas" e gerenciarem suas finanças juntos.

### Por que este projeto é necessário?

- **Experiência do Usuário:** O backend está completo e funcional, mas falta uma interface visual atrativa e intuitiva para os usuários
- **Gamificação:** Transformar gestão financeira em uma experiência envolvente e divertida através de elementos gamificados
- **Acessibilidade Visual:** Modo dark para reduzir fadiga visual e melhorar uso noturno
- **Engajamento:** Interface moderna e estilosa que motive os usuários a utilizarem o app regularmente

### Critérios de Sucesso

- [ ] Interface completamente responsiva (mobile-first)
- [ ] Modo dark/light totalmente funcional e persistente
- [ ] Sistema de gamificação implementado (níveis, conquistas, rankings)
- [ ] Integração completa com todas as APIs do backend
- [ ] Performance otimizada (Lighthouse score > 90)
- [ ] Acessibilidade WCAG 2.1 AA
- [ ] Animações suaves e transições fluidas
- [ ] Design moderno inspirado em apps financeiros populares

## 📋 O que será construído

### Funcionalidades Principais

1. **Sistema de Autenticação Gamificado**
   - Tela de login/registro com animações
   - Onboarding interativo para novos usuários
   - Animações de boas-vindas ao fazer login
   - Critérios de aceitação: Usuário consegue se registrar, fazer login e receber feedback visual adequado

2. **Dashboard Principal Gamificado**
   - Visão geral financeira com cards animados
   - Indicadores de progresso e níveis de usuário
   - Estatísticas visuais (gráficos interativos)
   - Sistema de XP (pontos de experiência) e nível do usuário
   - Critérios de aceitação: Dashboard carrega dados do backend, exibe informações de forma clara e animada

3. **Gestão de Transações com Gamificação**
   - Formulário de cadastro de transações intuitivo
   - Lista de transações com filtros e busca
   - Animações ao adicionar/remover transações
   - Conquistas desbloqueadas ao atingir metas
   - Badges por categorias de gastos
   - Critérios de aceitação: CRUD completo de transações funcionando, feedback visual imediato

4. **Sistema de Duplas**
   - Interface para vincular-se a outro usuário via código convite
   - Perfil do parceiro com estatísticas compartilhadas
   - Rankings comparativos entre a dupla
   - Desafios conjuntos e objetivos compartilhados
   - Critérios de aceitação: Usuário consegue vincular-se a outro, visualizar dados do parceiro

5. **Sistema de Categorias**
   - Listagem de categorias disponíveis
   - Personalização visual por categoria
   - Gráficos por categoria
   - Critérios de aceitação: Categorias exibidas corretamente, gráficos funcionam

6. **Modo Dark/Light**
   - Toggle fácil de acesso (preferencialmente no header)
   - Persistência da preferência no localStorage
   - Transições suaves entre modos
   - Paletas de cores contrastantes para ambos os modos
   - Critérios de aceitação: Modo persiste entre sessões, transições são suaves, contraste adequado

7. **Sistema de Gamificação**
   - **Sistema de Níveis:** Usuário ganha XP ao realizar ações (criar transação, atingir metas, etc.)
   - **Conquistas/Badges:** Desbloqueáveis por ações específicas
   - **Rankings:** Comparação com parceiro da dupla
   - **Estreias:** Animações ao desbloquear conquistas
   - **Progresso Visual:** Barras de progresso, círculos de nível
   - Critérios de aceitação: Sistema de XP funciona, conquistas são desbloqueadas corretamente

8. **Perfil do Usuário**
   - Informações do usuário
   - Estatísticas e métricas pessoais
   - Configurações de conta
   - Histórico de conquistas e badges
   - Critérios de aceitação: Perfil exibe dados corretos, configurações funcionam

### Casos de Uso

- **Caso 1: Novo Usuário**
  - Usuário acessa a aplicação
  - Faz cadastro com email e senha
  - Recebe código convite único
  - Passa por onboarding gamificado
  - Visualiza dashboard vazio com tutoriais

- **Caso 2: Usuário Existente**
  - Faz login
  - Visualiza dashboard com seus dados
  - Adiciona nova transação (receita/despesa)
  - Ganha XP e pode desbloquear conquista
  - Visualiza progresso e estatísticas

- **Caso 3: Formação de Dupla**
  - Usuário A compartilha código convite
  - Usuário B insere código na interface
  - Dupla é formada
  - Ambos visualizam perfil do parceiro
  - Rankings e comparações ficam disponíveis

- **Caso 4: Alternar Modo Dark**
  - Usuário clica no toggle dark/light
  - Interface muda suavemente para modo escuro
  - Preferência é salva
  - Ao retornar, modo escuro é mantido

## 🧠 Todo Contexto Necessário

### Documentação & Referências

- **arquivo:** `finhero/src/main/java/com/finhero/finhero/controller/AuthController.java`
  **por que:** Entender endpoints de autenticação e estrutura de dados

- **arquivo:** `finhero/src/main/java/com/finhero/finhero/controller/TransactionController.java`
  **por que:** Entender endpoints de transações e paginação

- **arquivo:** `finhero/src/main/java/com/finhero/finhero/controller/DuplaController.java`
  **por que:** Entender endpoint de vínculo de duplas

- **arquivo:** `finhero/src/main/java/com/finhero/finhero/filter/JwtAuthenticationFilter.java`
  **por que:** Entender como funciona autenticação JWT para implementar no frontend

- **url:** https://reactjs.org/docs/getting-started.html
  **por que:** Documentação oficial do React

- **url:** https://tailwindcss.com/docs
  **por que:** Framework CSS escolhido para estilização rápida e moderna

- **url:** https://framer.com/motion/
  **por que:** Biblioteca de animações para React recomendada

- **url:** https://recharts.org/
  **por que:** Biblioteca de gráficos para visualização de dados financeiros

- **doc:** https://www.figma.com/community/files/tag/finance-app
  **seção:** Inspirações de design para apps financeiros gamificados

- **doc:** https://dribbble.com/search/finance-app
  **seção:** Referências visuais de apps financeiros modernos

### Armadilhas Conhecidas

# CRÍTICO: JWT Token deve ser armazenado de forma segura (httpOnly cookies ou localStorage com cuidado)
# CRÍTICO: Não expor tokens em logs ou no console do navegador
# CRÍTICO: Validar todas as respostas da API antes de renderizar
# IMPORTANTE: Implementar loading states para todas as requisições assíncronas
# IMPORTANTE: Tratar erros de API de forma elegante com mensagens amigáveis
# IMPORTANTE: Optimizar bundle size - usar code splitting e lazy loading
# NOTA: Testar em diferentes navegadores (Chrome, Firefox, Safari)
# NOTA: Garantir que animações não causem problemas de acessibilidade

### Padrões do Projeto

#### Estrutura de Pastas Recomendada

```
frontend-finhero/
├── public/
│   ├── favicon.ico
│   └── assets/
├── src/
│   ├── components/
│   │   ├── common/          # Componentes reutilizáveis
│   │   ├── gamification/    # Componentes de gamificação
│   │   ├── transactions/    # Componentes de transações
│   │   ├── dashboard/       # Componentes do dashboard
│   │   └── auth/            # Componentes de autenticação
│   ├── pages/
│   │   ├── Login.tsx
│   │   ├── Register.tsx
│   │   ├── Dashboard.tsx
│   │   ├── Transactions.tsx
│   │   ├── Profile.tsx
│   │   └── Dupla.tsx
│   ├── services/
│   │   ├── api.ts           # Cliente axios/fetch
│   │   ├── auth.ts          # Serviços de autenticação
│   │   ├── transactions.ts  # Serviços de transações
│   │   └── gamification.ts  # Serviços de gamificação (local)
│   ├── hooks/
│   │   ├── useAuth.ts
│   │   ├── useTheme.ts
│   │   ├── useTransactions.ts
│   │   └── useGamification.ts
│   ├── context/
│   │   ├── AuthContext.tsx
│   │   ├── ThemeContext.tsx
│   │   └── GamificationContext.tsx
│   ├── utils/
│   │   ├── formatters.ts    # Formatação de valores, datas
│   │   ├── validators.ts    # Validações
│   │   └── constants.ts     # Constantes do app
│   ├── types/
│   │   └── index.ts         # TypeScript types/interfaces
│   ├── styles/
│   │   ├── globals.css
│   │   └── theme.css        # Variáveis CSS para temas
│   ├── App.tsx
│   └── main.tsx
├── package.json
├── tsconfig.json
├── tailwind.config.js
└── vite.config.ts (ou similar)
```

#### Convenções de Código

```typescript
// Estrutura de componente
import React from 'react';
import { motion } from 'framer-motion';

interface ComponentProps {
  title: string;
  optional?: boolean;
}

export const Component: React.FC<ComponentProps> = ({ title, optional = false }) => {
  return (
    <motion.div
      initial={{ opacity: 0 }}
      animate={{ opacity: 1 }}
      transition={{ duration: 0.3 }}
    >
      {title}
    </motion.div>
  );
};
```

- **Linguagem:** TypeScript
- **Framework:** React 18+ com hooks modernos
- **Roteamento:** React Router v6
- **Gerenciamento de Estado:** Context API + useState/useReducer (considerar Zustand se necessário)
- **Requisições HTTP:** Axios ou Fetch API
- **Estilização:** Tailwind CSS + CSS Modules ou styled-components
- **Animações:** Framer Motion
- **Gráficos:** Recharts ou Chart.js
- **Formulários:** React Hook Form + Zod (validação)
- **Testes:** Vitest + React Testing Library
- **Build Tool:** Vite
- **Convenções:**
  - Componentes em PascalCase
  - Hooks customizados com prefixo `use`
  - Arquivos de tipos com extensão `.ts`
  - Componentes com extensão `.tsx`
  - Usar functional components exclusivamente
  - Props interfaces devem ser nomeadas como `ComponentNameProps`

## 🏗️ Blueprint de Implementação

### Etapa 1: Setup e Configuração Base (12-16 horas)

```pseudocode
1. Criar projeto React com Vite + TypeScript
2. Instalar e configurar Tailwind CSS
3. Configurar estrutura de pastas
4. Configurar React Router
5. Criar arquivos de configuração (tsconfig, eslint, prettier)
6. Configurar variáveis de ambiente
7. Criar cliente HTTP base (axios/fetch)
8. Configurar interceptors para JWT
9. Criar tipos TypeScript baseados nos DTOs do backend
10. Setup básico de tema dark/light com Context API
```

**Entregas:**
- Projeto inicializado e configurado
- Roteamento básico funcionando
- Cliente HTTP configurado
- Sistema de temas base criado

### Etapa 2: Sistema de Autenticação (16-20 horas)

```pseudocode
1. Criar AuthContext com gerenciamento de estado
2. Implementar tela de Login com validação
3. Implementar tela de Register com validação
4. Criar hook useAuth
5. Implementar persistência de token
6. Criar ProtectedRoute component
7. Implementar logout
8. Adicionar animações de transição
9. Criar componente de loading/feedback
10. Integrar com backend /api/auth/register e /api/auth/login
```

**Entregas:**
- Login e registro funcionais
- Proteção de rotas implementada
- Token JWT sendo gerenciado corretamente

### Etapa 3: Design System e Componentes Base (20-24 horas)

```pseudocode
1. Definir paleta de cores para light/dark mode
2. Criar componentes base: Button, Input, Card, Modal
3. Criar componente de ThemeToggle
4. Implementar animações base com Framer Motion
5. Criar sistema de ícones (react-icons ou similar)
6. Criar componentes de feedback: Toast, Alert, Loading
7. Implementar tipografia consistente
8. Criar componentes de layout: Header, Sidebar, Container
9. Garantir responsividade mobile-first
10. Testar acessibilidade básica
```

**Entregas:**
- Biblioteca de componentes base completa
- Tema dark/light totalmente funcional
- Componentes acessíveis e responsivos

### Etapa 4: Dashboard Principal (24-30 horas)

```pseudocode
1. Criar layout do dashboard
2. Implementar cards de resumo financeiro
3. Integrar gráficos com Recharts
4. Criar sistema de XP e níveis (state local inicial)
5. Implementar cards animados com Framer Motion
6. Criar seção de transações recentes
7. Adicionar estatísticas básicas
8. Implementar loading states
9. Adicionar tratamento de erros
10. Criar animações de entrada para cards
```

**Entregas:**
- Dashboard funcional e visualmente atraente
- Gráficos exibindo dados reais
- Animações suaves implementadas

### Etapa 5: Gestão de Transações (28-32 horas)

```pseudocode
1. Criar página de listagem de transações
2. Implementar formulário de criação (modal ou página)
3. Adicionar filtros e busca
4. Implementar paginação
5. Criar componente de card de transação
6. Adicionar animações ao adicionar/remover
7. Integrar com /api/transactions
8. Criar validações no frontend
9. Implementar feedback visual (sucesso/erro)
10. Adicionar opção de edição (se backend permitir)
```

**Entregas:**
- CRUD completo de transações
- Interface intuitiva e responsiva
- Integração com backend funcionando

### Etapa 6: Sistema de Duplas (16-20 horas)

```pseudocode
1. Criar página/perfil de dupla
2. Implementar formulário de vinculação via código
3. Criar componente de exibição do parceiro
4. Implementar comparações e rankings
5. Adicionar gráficos comparativos
6. Integrar com /api/dupla/link
7. Criar animações de celebração ao vincular
8. Implementar indicadores de progresso conjunto
9. Adicionar notificações visuais
10. Criar seção de objetivos compartilhados (futuro)
```

**Entregas:**
- Sistema de duplas funcional
- Visualização de dados do parceiro
- Rankings comparativos

### Etapa 7: Sistema de Gamificação Avançado (24-28 horas)

```pseudocode
1. Criar sistema de XP e cálculo de níveis
2. Implementar banco de conquistas/badges
3. Criar componente de AchievementCard
4. Implementar animações de desbloqueio
5. Criar página de perfil com estatísticas
6. Implementar barras de progresso
7. Criar sistema de notificações de conquistas
8. Adicionar efeitos sonoros (opcional, com toggle)
9. Implementar ranking entre dupla
10. Criar celebrações visuais ao atingir metas
11. Persistir progresso no localStorage (ou backend futuro)
12. Criar dashboard de gamificação
```

**Entregas:**
- Sistema de gamificação completo
- Conquistas funcionando
- Animações de feedback implementadas

### Etapa 8: Sistema de Categorias (8-12 horas)

```pseudocode
1. Criar visualização de categorias
2. Integrar com /api/categories
3. Implementar gráficos por categoria
4. Adicionar cores/temas por categoria
5. Criar filtros por categoria
6. Adicionar ícones personalizados
```

**Entregas:**
- Visualização de categorias completa
- Gráficos por categoria funcionando

### Etapa 9: Perfil e Configurações (12-16 horas)

```pseudocode
1. Criar página de perfil
2. Exibir informações do usuário
3. Mostrar estatísticas e métricas
4. Criar seção de conquistas/badges desbloqueadas
5. Implementar configurações básicas
6. Adicionar opção de logout
7. Criar visualização do código convite
8. Adicionar exportação de dados (futuro)
```

**Entregas:**
- Perfil completo do usuário
- Configurações básicas funcionando

### Etapa 10: Polish, Otimizações e Testes (20-24 horas)

```pseudocode
1. Otimizar bundle size (code splitting)
2. Implementar lazy loading de rotas
3. Adicionar skeletons/loading states
4. Melhorar animações e transições
5. Otimizar performance (React.memo, useMemo, useCallback)
6. Adicionar tratamento de erros global
7. Implementar testes unitários básicos
8. Testar em diferentes navegadores
9. Validar acessibilidade (WCAG)
10. Fazer ajustes finais de UI/UX
11. Otimizar imagens e assets
12. Configurar PWA básico (opcional)
```

**Entregas:**
- Aplicação otimizada e performática
- Testes implementados
- Acessibilidade validada

### Estrutura de Arquivos Esperada

```
frontend-finhero/
├── public/
│   ├── favicon.ico
│   └── assets/
│       └── images/
├── src/
│   ├── components/
│   │   ├── common/
│   │   │   ├── Button.tsx
│   │   │   ├── Input.tsx
│   │   │   ├── Card.tsx
│   │   │   ├── Modal.tsx
│   │   │   ├── Loading.tsx
│   │   │   ├── Toast.tsx
│   │   │   ├── ThemeToggle.tsx
│   │   │   └── ProtectedRoute.tsx
│   │   ├── gamification/
│   │   │   ├── LevelProgress.tsx
│   │   │   ├── AchievementCard.tsx
│   │   │   ├── XPBar.tsx
│   │   │   ├── Badge.tsx
│   │   │   └── AchievementUnlock.tsx
│   │   ├── transactions/
│   │   │   ├── TransactionCard.tsx
│   │   │   ├── TransactionForm.tsx
│   │   │   ├── TransactionList.tsx
│   │   │   └── TransactionFilters.tsx
│   │   ├── dashboard/
│   │   │   ├── SummaryCards.tsx
│   │   │   ├── FinanceChart.tsx
│   │   │   ├── RecentTransactions.tsx
│   │   │   └── StatsPanel.tsx
│   │   └── auth/
│   │       ├── LoginForm.tsx
│   │       └── RegisterForm.tsx
│   ├── pages/
│   │   ├── Login.tsx
│   │   ├── Register.tsx
│   │   ├── Dashboard.tsx
│   │   ├── Transactions.tsx
│   │   ├── Profile.tsx
│   │   ├── Dupla.tsx
│   │   └── Categories.tsx
│   ├── services/
│   │   ├── api.ts
│   │   ├── auth.ts
│   │   ├── transactions.ts
│   │   ├── dupla.ts
│   │   └── categories.ts
│   ├── hooks/
│   │   ├── useAuth.ts
│   │   ├── useTheme.ts
│   │   ├── useTransactions.ts
│   │   ├── useDupla.ts
│   │   └── useGamification.ts
│   ├── context/
│   │   ├── AuthContext.tsx
│   │   ├── ThemeContext.tsx
│   │   └── GamificationContext.tsx
│   ├── utils/
│   │   ├── formatters.ts
│   │   ├── validators.ts
│   │   ├── constants.ts
│   │   └── storage.ts
│   ├── types/
│   │   └── index.ts
│   ├── styles/
│   │   ├── globals.css
│   │   └── theme.css
│   ├── App.tsx
│   └── main.tsx
├── .env
├── .env.example
├── .gitignore
├── package.json
├── tsconfig.json
├── tailwind.config.js
├── vite.config.ts
├── README.md
└── eslint.config.js
```

## 🔄 Loop de Validação

### Nível 1: Sintaxe & Estilo

```bash
# Validar TypeScript
npm run type-check

# Validar ESLint
npm run lint

# Formatar código
npm run format
```

### Nível 2: Testes Unitários

```bash
# Executar testes
npm test

# Cobertura de testes
npm run test:coverage
```

### Nível 3: Teste de Integração

```bash
# Verificar build de produção
npm run build

# Preview da build
npm run preview

# Testar em diferentes navegadores manualmente
```

### Nível 4: Validação Funcional

- [ ] Login e registro funcionam corretamente
- [ ] Dashboard carrega dados do backend
- [ ] Transações podem ser criadas, listadas e visualizadas
- [ ] Sistema de duplas permite vincular usuários
- [ ] Modo dark/light alterna corretamente e persiste
- [ ] Gamificação funciona (XP, níveis, conquistas)
- [ ] Interface é responsiva em mobile e desktop
- [ ] Animações são suaves e não causam problemas de performance
- [ ] Acessibilidade básica funciona (navegação por teclado)

## 📦 Entregáveis Esperados

### Código
- [ ] Projeto React completo e funcional
- [ ] Todos os componentes implementados
- [ ] Integração completa com APIs do backend
- [ ] Sistema de temas dark/light
- [ ] Sistema de gamificação funcional
- [ ] Código documentado e bem estruturado

### Funcionalidades
- [ ] Autenticação (login/registro)
- [ ] Dashboard principal
- [ ] CRUD de transações
- [ ] Sistema de duplas
- [ ] Visualização de categorias
- [ ] Perfil do usuário
- [ ] Modo dark/light
- [ ] Gamificação completa

### Testes
- [ ] Testes unitários para componentes principais
- [ ] Testes de integração para serviços
- [ ] Testes E2E para fluxos críticos (opcional)

### Documentação
- [ ] README.md com instruções de setup
- [ ] Documentação de componentes principais
- [ ] Guia de contribuição
- [ ] Documentação da arquitetura

## ✅ Critérios de Qualidade

### Código
- [ ] Código limpo seguindo convenções do projeto
- [ ] TypeScript sem erros (`strict: true`)
- [ ] Componentes reutilizáveis e bem organizados
- [ ] Sem código duplicado
- [ ] Comentários onde necessário

### Performance
- [ ] Lighthouse Performance Score > 90
- [ ] Bundle size otimizado (< 500KB inicial)
- [ ] Lazy loading de rotas implementado
- [ ] Memoização de componentes pesados
- [ ] Imagens otimizadas

### Segurança
- [ ] Token JWT armazenado de forma segura
- [ ] Validação de inputs no frontend
- [ ] Proteção contra XSS
- [ ] Não expor informações sensíveis no código

### Usabilidade
- [ ] Interface intuitiva e fácil de usar
- [ ] Feedback visual adequado para todas as ações
- [ ] Mensagens de erro claras e amigáveis
- [ ] Loading states em todas as operações assíncronas
- [ ] Responsividade em todos os dispositivos

### Acessibilidade
- [ ] Navegação por teclado funcional
- [ ] Contraste adequado (WCAG AA)
- [ ] Labels adequados para screen readers
- [ ] Foco visível em elementos interativos

## 📚 Exemplos e Referências

### Inspirações de Design

**Apps Financeiros Gamificados:**
- **Nubank:** Interface minimalista e moderna, uso de gradientes e animações suaves
- **Mint:** Dashboard organizado com gráficos claros
- **YNAB (You Need A Budget):** Foco em organização e visualização clara
- **C6 Bank:** Gamificação com benefícios e recompensas

**Apps com Gamificação:**
- **Duolingo:** Sistema de XP, níveis e streak muito eficaz
- **Habitica:** RPG de hábitos - excelente inspiração para elementos gamificados
- **Forest:** Visualização de progresso e recompensas

**Apps com Modo Dark Exemplar:**
- **GitHub:** Transição suave entre temas
- **Twitter/X:** Paleta de cores bem pensada
- **Discord:** Modo dark confortável para uso prolongado

### Paleta de Cores Sugerida

**Light Mode:**
- Primary: `#6366F1` (Indigo)
- Secondary: `#8B5CF6` (Purple)
- Success: `#10B981` (Green)
- Danger: `#EF4444` (Red)
- Warning: `#F59E0B` (Amber)
- Background: `#FFFFFF`
- Surface: `#F9FAFB`
- Text: `#111827`

**Dark Mode:**
- Primary: `#818CF8` (Indigo Light)
- Secondary: `#A78BFA` (Purple Light)
- Success: `#34D399` (Green Light)
- Danger: `#F87171` (Red Light)
- Warning: `#FBBF24` (Amber Light)
- Background: `#0F172A` (Slate 900)
- Surface: `#1E293B` (Slate 800)
- Text: `#F1F5F9` (Slate 100)

### Exemplos de Componentes

```typescript
// Exemplo: ThemeToggle Component
import { useTheme } from '@/hooks/useTheme';
import { Sun, Moon } from 'lucide-react';

export const ThemeToggle = () => {
  const { theme, toggleTheme } = useTheme();
  
  return (
    <button
      onClick={toggleTheme}
      className="p-2 rounded-lg bg-gray-200 dark:bg-gray-700 hover:bg-gray-300 dark:hover:bg-gray-600 transition-colors"
      aria-label="Alternar tema"
    >
      {theme === 'dark' ? <Sun /> : <Moon />}
    </button>
  );
};
```

```typescript
// Exemplo: Achievement Unlock Animation
import { motion, AnimatePresence } from 'framer-motion';

export const AchievementUnlock = ({ achievement, onClose }) => {
  return (
    <AnimatePresence>
      <motion.div
        initial={{ scale: 0, opacity: 0 }}
        animate={{ scale: 1, opacity: 1 }}
        exit={{ scale: 0, opacity: 0 }}
        className="achievement-popup"
      >
        <h3>🎉 Conquista Desbloqueada!</h3>
        <p>{achievement.name}</p>
        <p>{achievement.description}</p>
      </motion.div>
    </AnimatePresence>
  );
};
```

### Referências Técnicas

- [React Documentation](https://react.dev)
- [TypeScript Handbook](https://www.typescriptlang.org/docs/)
- [Tailwind CSS Documentation](https://tailwindcss.com/docs)
- [Framer Motion Documentation](https://www.framer.com/motion/)
- [React Router Documentation](https://reactrouter.com)
- [Recharts Documentation](https://recharts.org)
- [React Hook Form](https://react-hook-form.com)
- [Zod Documentation](https://zod.dev)

## 🔧 Configuração de Desenvolvimento

### Pré-requisitos

- Node.js >= 18.0.0
- npm >= 9.0.0 ou yarn >= 1.22.0
- Git
- Backend FinHero rodando em `http://localhost:8080`

### Setup Inicial

```bash
# Criar projeto React com Vite
npm create vite@latest frontend-finhero -- --template react-ts

# Entrar no diretório
cd frontend-finhero

# Instalar dependências
npm install

# Instalar dependências adicionais
npm install react-router-dom axios framer-motion recharts react-hook-form zod @hookform/resolvers
npm install -D @types/node tailwindcss postcss autoprefixer
npm install lucide-react # ou react-icons para ícones

# Inicializar Tailwind CSS
npx tailwindcss init -p

# Executar em desenvolvimento
npm run dev
```

### Configuração do Tailwind

```javascript
// tailwind.config.js
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  darkMode: 'class', // Ativar modo dark via classe
  theme: {
    extend: {
      colors: {
        // Paleta customizada aqui
      },
    },
  },
  plugins: [],
}
```

### Variáveis de Ambiente

```env
# .env
VITE_API_URL=http://localhost:8080/api
VITE_APP_NAME=FinHero
VITE_ENABLE_SOUNDS=false
```

### Comandos de Desenvolvimento

```bash
# Desenvolvimento
npm run dev

# Build para produção
npm run build

# Preview da build
npm run preview

# Lint
npm run lint

# Type check
npm run type-check

# Testes
npm test
npm run test:coverage
```

### Estrutura de API Client

```typescript
// src/services/api.ts
import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
  headers: {
    'Content-Type': 'application/json',
  },
});

// Interceptor para adicionar token
api.interceptors.request.use((config) => {
  const token = localStorage.getItem('token');
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});

export default api;
```

## 📊 Sistema de Gamificação - Detalhamento

### Mecânicas de Gamificação

#### 1. Sistema de XP (Pontos de Experiência)

**Ações que geram XP:**
- Cadastrar transação: +10 XP
- Cadastrar 5 transações em um dia: +50 XP (bônus)
- Cadastrar 10 transações em um dia: +100 XP (bônus)
- Vincular-se a uma dupla: +100 XP
- Manter streak de 7 dias cadastrando transações: +200 XP
- Completar perfil: +50 XP
- Primeira transação: +25 XP

**Fórmula de Nível:**
```
XP necessário para nível N = 100 * N * (N + 1) / 2
Nível 1: 0-100 XP
Nível 2: 101-300 XP
Nível 3: 301-600 XP
...
```

#### 2. Conquistas/Badges

**Lista de Conquistas:**
1. **Primeiro Passo** 🎯 - Cadastre sua primeira transação
2. **Organizado** 📊 - Cadastre 10 transações
3. **Mestre das Finanças** 💰 - Cadastre 100 transações
4. **Dupla Perfeita** 👫 - Vincule-se a um parceiro
5. **Fiel** 🔥 - Mantenha um streak de 7 dias
6. **Economista** 💸 - Tenha mais receitas que despesas em um mês
7. **Equilibrado** ⚖️ - Mantenha despesas abaixo de 80% da receita
8. **Campeão** 🏆 - Seja nível 10 ou superior
9. **Análise Completa** 📈 - Visualize gráficos por 10 dias seguidos
10. **Parceiro Confiável** 🤝 - Dupla ativa por 30 dias

#### 3. Rankings e Comparações

- **Ranking de XP** entre a dupla
- **Ranking de Transações** (quantidade)
- **Ranking de Economia** (% de receita economizada)
- **Progresso Individual vs Parceiro** (gráficos comparativos)

#### 4. Feedback Visual

- Animações de confetti ao desbloquear conquistas
- Barras de progresso animadas
- Notificações toast para eventos importantes
- Efeitos de partículas ao ganhar XP (opcional)
- Sons de feedback (opcional, com toggle)

## 🎨 Diretrizes de Design

### Princípios de Design

1. **Clareza:** Informações financeiras devem ser claras e fáceis de entender
2. **Feedback Imediato:** Todas as ações devem ter feedback visual
3. **Hierarquia Visual:** Elementos importantes devem se destacar
4. **Consistência:** Padrões de design consistentes em toda a aplicação
5. **Acessibilidade:** Design inclusivo que funcione para todos

### Componentes de Design

- **Cards:** Bordas arredondadas, sombras sutis, hover effects
- **Botões:** Estados claros (default, hover, active, disabled)
- **Formulários:** Labels claros, validação em tempo real, mensagens de erro
- **Gráficos:** Cores contrastantes, tooltips informativos
- **Animações:** Suaves (0.2s-0.5s), não intrusivas

### Responsividade

- **Mobile First:** Projetar primeiro para mobile
- **Breakpoints:**
  - Mobile: < 640px
  - Tablet: 640px - 1024px
  - Desktop: > 1024px
- **Touch Targets:** Mínimo 44x44px em mobile

## 📝 Notas Adicionais

### Considerações de Performance

- Usar `React.memo` para componentes que não mudam frequentemente
- Implementar virtualização para listas longas (react-window)
- Lazy loading de imagens
- Code splitting por rota
- Debounce em buscas e filtros

### Considerações de Segurança

- Nunca logar tokens no console
- Validar todos os inputs do usuário
- Sanitizar dados antes de renderizar
- Usar HTTPS em produção
- Implementar CSRF protection se necessário

### Melhorias Futuras

- Notificações push
- Exportação de dados (PDF/CSV)
- Objetivos e metas personalizadas
- Chat entre dupla
- Histórico de transações mais completo
- Relatórios detalhados
- Integração com bancos (Open Banking)
- App mobile nativo (React Native)

### Integração com Backend

**Endpoints Utilizados:**

```
POST   /api/auth/register    - Cadastro
POST   /api/auth/login       - Login
GET    /api/transactions     - Listar transações
POST   /api/transactions     - Criar transação
GET    /api/categories       - Listar categorias
POST   /api/dupla/link       - Vincular dupla
```

**Estrutura de Autenticação:**
- Token JWT no header: `Authorization: Bearer <token>`
- Token armazenado no localStorage
- Refresh token (se implementado no backend)

---

## 🚀 Instruções para Implementação

1. **Leia todo este documento** cuidadosamente
2. **Siga o blueprint** de implementação passo a passo
3. **Execute os comandos de validação** após cada etapa
4. **Corrija erros** imediatamente quando encontrados
5. **Valide critérios de sucesso** antes de avançar
6. **Documente decisões importantes** durante o desenvolvimento
7. **Teste em diferentes dispositivos** e navegadores
8. **Peça feedback** aos usuários quando possível

---

**Criado em:** 2025-01-27  
**Última Atualização:** 2025-01-27  
**Status:** Planejamento Completo - Pronto para Implementação

