<%--
  Created by IntelliJ IDEA.
  User: Matthieu
  Date: 25/02/2017
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp">
    <jsp:param name="titre" value="Edition d'une oeuvre"/>
</jsp:include>
<script>
    $(document).ready(function () {
        $('#tableOeuvres').DataTable({
            language: fr_language
        });

        $('a[data-toggle=modal], button[data-toggle=modal]').click(function () {
            $('#idOeuvrevente').val($(this).data('id'));
        });
    });
</script>

    <h1>Edition d'une oeuvre</h1>
    <form class="form-horizontal" name='identification' method="post" action="editer?idOeuvrevente=${idOeuvrevente}">
        <div class="form-group">
            <label class="control-label col-sm-2">Titre de l'oeuvre :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="txttitre" id="txttitre" placeholder="Entrez le titre ..." value="${txttitre}" required>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2">Prix de l'oeuvre :</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" name="numberprix" id="numberprix" value="${numberprix}" min="0" required>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2">Proprietaire de l'oeuvre :</label>
            <div class="col-sm-10">
                <select id="idProprietaire" name="idProprietaire">
                    <c:forEach items="${proprietaires}" var="proprietaire">
                        <option value="${proprietaire.idProprietaire}">${proprietaire.nomComplet}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-info pull pull-right">Modifier</button>
            </div>
        </div>
    </form>

<jsp:include page="../footer.jsp">
    <jsp:param name="titre" value="Expo : Médiathèque De POLYTECH"/>
</jsp:include>
