SUMMARY = "A module for monitoring memory usage of a python program"
DESCRIPTION = "This is a python module for monitoring memory consumption of a process \
as well as line-by-line analysis of memory consumption for python \
programs. It is a pure python module and has the psutil \
module as optional (but highly recommended) dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.57.0"

RPM_NAME = "python39-memory_profiler-0.57.0-2.13.noarch.rpm"
RPM_HASH = "554a7bb6b86605b662d5d86ba13454a40e1e1f86f4e9cb165a8bf6caf246b0feec50c5859a02045324c71872dd5fc21509a33cf965d35a1606a94f07f53ed1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(memory-profiler) python39-memory_profiler python3dist(memory-profiler)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-psutil update-alternatives"

inherit rpm
