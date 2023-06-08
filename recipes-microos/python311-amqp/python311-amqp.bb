SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "python311-amqp-5.1.1-1.5.noarch.rpm"
RPM_HASH = "876d2c427deeb4a57079c242018f811d107b297000394d2632060afc9114b4f43876a2165f00712e990df67a42ad94a6213ac544643cc6f434d5c8142d1b57de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(amqp) python311-amqp python3dist(amqp)"
RDEPENDS:${PN} += "python(abi) python311-vine"

inherit rpm
