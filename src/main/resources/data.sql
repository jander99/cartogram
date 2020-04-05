-- Product Code
insert into product_codes(product_code, description, created, created_by) values (12345, 'This is a product code', current_timestamp , 'jeff');
insert into product_codes(product_code, description, created, created_by) values (61720, 'Gloves - more protective', current_timestamp , 'jeff');
insert into product_codes(product_code, description, created, created_by) values (90026, 'Gloves - less protective', current_timestamp , 'jeff');
insert into product_codes(product_code, description, created, created_by) values (89998, 'Taxable retail items', current_timestamp , 'jeff');

-- Goods Service Code
insert into goods_service_codes(goods_service_code, description, created, created_by) values (1234567, 'This is a GSC', current_timestamp , 'jeff');
insert into goods_service_codes(goods_service_code, description, created, created_by) values (2038972, 'Gloves - protective', current_timestamp , 'jeff');
insert into goods_service_codes(goods_service_code, description, created, created_by) values (9876543, 'This is another GSC', current_timestamp , 'jeff');
insert into goods_service_codes(goods_service_code, description, created, created_by) values (2038710, 'Taxable retail items', current_timestamp , 'jeff');

-- Sovos Mapping
insert into sovos_code_mappings(gsc_id, pc_id, created, created_by) values (1234567, 12345, current_timestamp , 'jeff');
insert into sovos_code_mappings(gsc_id, pc_id, created, created_by) values (9876543, 12345, current_timestamp , 'jeff');
insert into sovos_code_mappings(gsc_id, pc_id, created, created_by) values (2038710, 89998, current_timestamp , 'jeff');
insert into sovos_code_mappings(gsc_id, pc_id, created, created_by) values (2038972, 90026, current_timestamp , 'jeff');
insert into sovos_code_mappings(gsc_id, pc_id, created, created_by) values (2038972, 61720, current_timestamp , 'jeff');


-- Hierarchy Data
insert into hierarchies(department_number, class_number, subclass_number, department_name, class_name, subclass_name) values(21, 1, 3, 'LUMBER', 'PLYWOOD', 'SHEATHING');

-- SKU Mappings (Req Hierarchy, Product Code, Goods Service Code)
insert into sku_mappings(sku, department_number, class_number, subclass_number, product_code, goods_service_code) values(123456, 21, 1, 3, 12345, 1234567);
insert into sku_mappings(sku, department_number, class_number, subclass_number, product_code, goods_service_code) values(987654, 21, 1, 3, 89998, 2038710);
