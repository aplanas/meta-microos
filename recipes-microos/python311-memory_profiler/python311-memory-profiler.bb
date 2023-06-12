SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.57.0"

RPM_NAME = "python311-memory_profiler-0.57.0-2.13.noarch.rpm"
RPM_HASH = "aac0e38dff75a3fb47a8aa44dae9777ca0988d454043d2dbc599113dd35bf5fa877603303c5f9cd9c894df76c7d465eb83f5ac0e3ebdeebdc56503f5a7f390a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(memory-profiler) \
python311-memory_profiler \
python3dist(memory-profiler)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-psutil \
update-alternatives"

inherit rpm
