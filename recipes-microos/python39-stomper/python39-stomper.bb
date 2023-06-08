SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-stomper-0.4.3-2.12.noarch.rpm"
RPM_HASH = "a2ca8561b3c89b4bc0993c380d0d484819f02037da4b8f2414e4ab8fe39fdb96864c2fd9b5391bc07cbaeedb1f075b75015d767ca7104fc87c692938b4db68df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(stomper) python39-stomper python3dist(stomper)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
