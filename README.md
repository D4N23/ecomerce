<h1 align="center">Api de Ecomerce com Spring-Boot </h1> 

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,docker,mysql" />
  </a>
</p>


<p align="left">Esta API Spring Boot para fornecer um sistema completo de ecomerce, com wallet, motor de busca de produto, transações entre clientes e vendedores, com suporte à autenticação usando o Spring Security e geração de tokens JWT (JSON Web Token).</p>
<p aling="left"> Os dados são persistidos em um banco de dados MySQL, que é executado dentro de um container Docker.
  Essa abordagem oferece uma solução eficiente para armazenar e gerenciar os dados de forma escalável e consistente.</p>


<h2 align="center">Recursos Principais</h2>

<h3 align="left">Autenticação e Autorização:</h3>

 <ul>
      <li>A API utiliza o Spring Security para autenticação e autorização.</li>
      <li>O processo de autenticação é baseado em tokens JWT, proporcionando um meio seguro e escalável de gerenciar sessões de usuário.</li>
 </ul>
 
</ul>
<h3 aling="left">Endpoints:</h3>
  <h4 aling="left">Addresses:</h4>
    <ul>
      <li><strong>GET api/v1/address</strong>: Endpoint para recuperar a lista de todas os endereços disponíveis.</li>
      <li><strong>GET  api/v1/address/addressId</strong>: Endpoint para obter detalhes específicos de um endereço atraves do Id.</li>
      <li><strong>POST api/v1/address</strong>: Endpoint para inserir um novo endereço na base de dados.</li>
      <li><strong>GET api/v1/address/userId</strong>: Endpoint encontra o endereço atraves do Id do usuario cadastrado.</li>
      <li><strong>PUT api/v1/address/addressId </strong>: Endpoint realizar a atualizção dos dados do endereço cadastrado através do Id.</li>
      <li><strong>DELETE api/v1/address/addressId </strong>: Endpoint realizar exclusão da base de dados dos endereços encontrados pelo Id.</li>
    </ul>
 
 


