SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-pika-pool-0.1.3-5.12.noarch.rpm"
RPM_HASH = "8e4fe031a907dfa9807d3246292d2b8cadac157d1de8a5226d364e084dcf2fb2cdfaf41eed023082706c567a7a176d0990638551c917031603b3510da02c13a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pika-pool) \
python311-pika-pool \
python3dist(pika-pool)"
RDEPENDS:${PN} += "python(abi) \
python311-pika"

inherit rpm
