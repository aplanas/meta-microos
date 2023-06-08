SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "python310-amqp-5.1.1-1.5.noarch.rpm"
RPM_HASH = "a4eb40d8efe91bc92329cbac353085995178cb5b7f984ec00ce8a02750fee177fb973fcb36f759b7150de11cc5b98e5b0c03b957fffe14f7b45809e0eaed84d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-amqp python3.10dist(amqp) python310-amqp python3dist(amqp)"
RDEPENDS:${PN} += "python(abi) python310-vine"

inherit rpm
