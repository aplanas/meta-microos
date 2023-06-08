SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python39-amqpstorm-2.10.4-1.5.noarch.rpm"
RPM_HASH = "113cc6b5b042b7dc35803cdb1505c266403993d8918a7f3cec8b431eedd9a509804f7658aa66feb971ed79da11de3a3a743ce3ed2179afb72b3159393e0fed0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(amqpstorm) python39-amqpstorm python3dist(amqpstorm)"
RDEPENDS:${PN} += "python(abi) python39-pamqp python39-requests"

inherit rpm
