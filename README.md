# Spring-Docker-Starter

- springbootとmysqlをdocker環境で構築するオレオレStarter

## Description

- springbootをサーバーサイドでdatabaseとしてmysqlを使用する
- 今後フロントエンドとしてREACTを使えるようにする。

## Installation

- develop
``` shell
$ git clone https://github.com/hashimotoren/docker_spring_starter
$ cd docker_spring_starter
$ vi .env
$ docker-compose -f docker-compose.develop.yml up -d
```

- .env
```.env
MYSQL_DATABASE=
MYSQL_USER=
MYSQL_PASSWORD=
MYSQL_ROOT_PASSWORD=
```
## Author
- twitter
[@hashiserver](https://twitter.com/hashimo326_g)

- mail to: 
hashiserver@gmail.com

## License

MIT
