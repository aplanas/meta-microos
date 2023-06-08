SUMMARY = "Class library for writing Nagios (Icinga) plugins"
DESCRIPTION = "nagiosplugin is a Python class library which helps writing Nagios (or Icinga) \
compatible plugins in Python. It cares for much of the boilerplate code \
and default logic commonly found in Nagios checks, including: \
 \
- Nagios 3 Plugin API compliant parameters and output formatting \
- Full Nagios range syntax support \
- Automatic threshold checking \
- Multiple independent measures \
- Custom status line to communicate the main point quickly \
- Long output and performance data \
- Timeout handling \
- Persistent 'cookies' to retain state information between check runs \
- Resumption of log file processing at the point where the last run left off \
- No dependencies beyond the Python standard library"
LICENSE = "ZPL-2.1"

PV = "1.3.3"

RPM_NAME = "python310-nagiosplugin-1.3.3-1.3.noarch.rpm"
RPM_HASH = "b9fcf91d22744c0925c714178671892a5065983bf9efc99eaf2d8d3fb41f2400c66d602390e4939dd3c90be4466bf04cbbe2f0bc3c851f46482a2deb98acf361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nagiosplugin python3.10dist(nagiosplugin) python310-nagiosplugin python3dist(nagiosplugin)"
RDEPENDS:${PN} += "python(abi) python310-setuptools"

inherit rpm
