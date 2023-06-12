SUMMARY = "Linux Trace Toolkit Userspace Tracer Python 3 agent"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem. \
 \
This package provides the LLTng-UST Python 3 agent."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "python3-lttngust-2.13.5-1.3.aarch64.rpm"
RPM_HASH = "83157f3e1eddc3973cde841a926733133b376890ac88ec38825a592899bd69de09e238df00719f9a0619fa1ced47c3e8ad969c5a7399da43c6b7ca65ab4d43e3"

RPROVIDES:${PN} += "python3-lttngust \
python3-lttngust(aarch-64) \
python3.10dist(lttngust) \
python3dist(lttngust)"
RDEPENDS:${PN} += "liblttng-ust-python-agent1 \
python(abi)"

inherit rpm
