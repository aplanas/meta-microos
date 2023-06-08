SUMMARY = "Pure-python AMQP 0-9-1 frame encoder and decoder"
DESCRIPTION = "pamqp is a pure-python AMQP 0-9-1 frame encoder and decoder. \
 \
pamqp is not a end-user client library for talking to RabbitMQ but \
rather is used by client libraries for marshaling and unmarshaling \
AMQP frames. \
 \
AMQP class/method command class mappings can be found in the \
pamqp.specification module while actual frame encoding and \
encoding should be run through the pamqp.frame module."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-pamqp-3.2.1-1.3.noarch.rpm"
RPM_HASH = "3c5259ef14e665f89762e05b72f1a8e33ba1fe78099c58725a2097493de80b59b83c165f7b6967893a859484c8c1affc6211afd80a565e9af792f5ceacba2763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pamqp) python39-pamqp python3dist(pamqp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
