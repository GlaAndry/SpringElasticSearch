# SpringElasticSearch

##Configurazione iniziale di ElasticSearch e Kibana:
La memoria massima configurata non è sufficiente ad Elastic Search. Per risolvere il problema eseguire:

    - sudo sysctl -w vm.max_map_count=262144

Per rendere la modifica permanente invece esegurie:
    
    1. cd /etc/
    2. sudo nano sysctl.conf
    3. aggiungere la linea: vm.max.map_count=262144
    4. Salvare le modifiche.

Eseguire inoltre il comando iniziale per rendere effettive le modifiche verso il Kernel.
