SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python310-amqpstorm-2.10.4-1.5.noarch.rpm"
RPM_HASH = "beb30ff6782ef5e029fc973d9a5d0f83ab46a7bc0e9098d3e8a8117856a6337805c74944b76001330c08c58df59a4a68c57b1442e25a69887ebc37e9c3ffd222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-amqpstorm python3.10dist(amqpstorm) python310-amqpstorm python3dist(amqpstorm)"
RDEPENDS:${PN} += "python(abi) python310-pamqp python310-requests"

inherit rpm
