-- GUIA 14 - EJERCICIO 1 -- 

-- 1. Obtener los datos completos de los empleados 
SELECT * FROM empleados;

-- 2. Obtener los datos completos de los departamentos. 
SELECT * FROM departamentos;

-- 3. Listar el nombre de los departamentos. 
select nombre_depto from departamentos;

-- 4. Obtener el nombre y salario de todos los empleados.
select nombre, sal_emp from empleados;

-- 5. Listar todas las comisiones.  select comision_emp from empleados; 
select comision_emp from empleados;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
select * from empleados where cargo_emp = 'secretaria';

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
select * 
from empleados 
where cargo_emp = 'vendedor' 
order by nombre;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
select nombre, cargo_emp, sal_emp 
from empleados
order by sal_emp;

-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
select nombre_jefe_depto 
from departamentos
where ciudad = 'ciudad real';

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
select nombre Nombre , cargo_emp Cargo
From empleados;

-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
select sal_emp, comision_emp 
from empleados
where id_depto = 2000
order by comision_emp;

-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta  de: sumar el salario y la comisión, 
-- más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.
 select nombre, sum(sal_emp + comision_emp + 500) as Total_Pagar
 from empleados
 where id_depto = 3000
 group by nombre
 order by nombre;
 
 -- 13. Muestra los empleados cuyo nombre empiece con la letra J.
select * 
from empleados
where nombre like 'j%'; 

-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos 
-- empleados que tienen comisión superior a 1000. 
 select nombre, sal_emp, comision_emp, (comision_emp + sal_emp) as Salario_Total
 from empleados
 where comision_emp > 1000;

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión. 
 select nombre, sal_emp, comision_emp, (comision_emp + sal_emp) as Salario_Total
 from empleados
 where comision_emp = 0 ;

-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
select * 
from empleados
where comision_emp > sal_emp;

-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
select * 
from empleados
where comision_emp <= (sal_emp * 0.3);

-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
select *
from empleados
where nombre like '%ma%';

-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento'.
select *
from departamentos
where nombre_depto in("ventas", "investigacion","mantenimiento");

-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni  “Investigación” ni ‘Mantenimiento".
select *
from departamentos
where nombre_depto not in("ventas", "investigacion","mantenimiento");

-- 21. Mostrar el salario más alto de la empresa.
select max(sal_emp)
from empleados;

-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
select max(nombre) 
from empleados;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
select max(sal_emp) Salario_Max, min(sal_emp), ( max(sal_emp)-min(sal_emp)) as Diferencia
from empleados;

-- 24. Hallar el salario promedio por departamento. 
select round(avg(sal_emp)) Salario_Promedio, id_depto
from empleados
group by id_depto;

-- Consultas con Having --
-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
select id_depto, count(nombre)
from empleados
group by id_depto having(count(nombre)>3);

-- 26. Hallar los departamentos que no tienen empleados. 
select id_depto  Departamento, count(id_emp) Cantidad_Empleados 
from empleados 
group by id_depto having(count(id_emp)) = 0;

	-- Inner Join -- 
 select *
 from departamentos d
 inner join empleados e
 on d.id_depto = e.id_depto;
  
	-- left join --
 select *
 from departamentos d
 left join empleados e
 on d.id_depto = e.id_depto;
 
	-- rigth join --
 select *
 from departamentos d
 right join empleados e
 on d.id_depto = e.id_depto;
 
	-- Exist --
 select *
 from departamentos d
  where exists 
  (select nombre 
  from empleados e
  where e.id_depto = d.id_depto);
    
    -- Consulta Multitabla (Uso de la sentencia JOIN/LEFT JOIN/RIGHT JOIN) --
    
-- 27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada departamento.
select e.nombre, d.id_depto, d.nombre_jefe_depto
from empleados e, departamentos d
where e.id_depto = d.id_depto;

 -- Consulta con Subconsulta  

-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento  
 select nombre
 from empleados
 where sal_emp >= (select avg(sal_emp) from empleados)
 order by id_depto;
