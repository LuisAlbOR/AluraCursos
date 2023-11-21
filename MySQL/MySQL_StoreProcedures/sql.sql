/*Crea un SP para reajustar el % de comisión de los vendedores. Incluye como parámetro del SP el %, expresado en valor (Ex: 0,90).

Nombre del Stored Procedure: reajuste_comision.
*/
DELIMITER $$
CREATE PROCEDURE `reajuste_comision`(vporcentaje FLOAT)
BEGIN
UPDATE tabla_de_vendedores SET PORCENTAJE_COMISION =  PORCENTAJE_COMISION * (1 + vporcentaje);
END $$