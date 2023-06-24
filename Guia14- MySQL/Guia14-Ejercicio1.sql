-- GUIA 14 - EJERCICIO 1 -- 

-- 1. Obtener los datos completos de los empleados 
SELECT * FROM empleados;

-- 2. Obtener los datos completos de los departamentos. 
SELECT * FROM departamentos;

-- 3. Listar el nombre de los departamentos. select nombre_depto from departamentos; 
-- Obtener el nombre y salario de todos los empleados. select nombre, sal_emp from empleados; 
-- Listar todas las comisiones. select comision_emp from empleados; 
-- Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’. select * from empleados where cargo_emp = "secretaria"; 
-- Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente. select * from empleados where cargo_emp = "vendedor" order by nombre desc;
