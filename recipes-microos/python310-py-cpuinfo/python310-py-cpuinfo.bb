SUMMARY = "Python library and tool to get CPU info"
DESCRIPTION = "Py-cpuinfo gets CPU info with pure Python. Py-cpuinfo should work \
without any extra programs or libraries, beyond what your OS \
provides. It supports Linux, OS X, Windows, BSD, Solaris, \
Cygwin, Haiku, and BeagleBone, but only on x86 and some ARM CPUs. \
 \
These approaches are used for getting info: \
 1. Windows Registry (Windows) \
 2. /proc/cpuinfo (Linux) \
 3. sysctl (OS X) \
 4. dmesg (Unix/Linux) \
 5. isainfo and kstat (Solaris) \
 6. cpufreq-info (BeagleBone) \
 7. lscpu (Unix/Linux) \
 8. sysinfo (Haiku) \
 9. Querying the CPUID register (Intel X86 CPUs)"
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-py-cpuinfo-9.0.0-2.1.noarch.rpm"
RPM_HASH = "d7f97f108e501c0a33fb64a62797d7153e99ae6d0d52b8d73edf2373a2b2340d6127e1297f8acb0d2b5516ea48086800fd15bde7042c51cc9f4aa92f44bae089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-cpuinfo \
python3.10dist(py-cpuinfo) \
python310-py-cpuinfo \
python3dist(py-cpuinfo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
