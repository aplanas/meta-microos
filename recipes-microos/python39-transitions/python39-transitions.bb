SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.8.10"

RPM_NAME = "python39-transitions-0.8.10-2.6.noarch.rpm"
RPM_HASH = "d62ae3a0f136ddf236ceec3defcd70a28a8d5844667d56122c29461516eb13cd653b5da60a925dcfa752c5f09decd514c15bda9bee92107f5aea476d4ef6c287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(transitions) python39-transitions python3dist(transitions)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
