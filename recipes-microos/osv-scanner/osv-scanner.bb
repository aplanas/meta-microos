SUMMARY = "Vulnerability scanner written in Go"
DESCRIPTION = "Use OSV-Scanner to find existing vulnerabilities affecting your project's dependencies. \
 \
OSV-Scanner provides an officially supported frontend to the OSV database that connects a project’s list of dependencies with the vulnerabilities that affect them. Since the OSV.dev database is open source and distributed, it has several benefits in comparison with closed source advisory databases and scanners: \
 \
- Each advisory comes from an open and authoritative source (e.g. the RustSec Advisory Database) \
- Anyone can suggest improvements to advisories, resulting in a very high quality database \
- The OSV format unambiguously stores information about affected versions in a machine-readable format that precisely maps onto a developer’s list of packages \
 \
The above all results in fewer, more actionable vulnerability notifications, which reduces the time needed to resolve them."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "osv-scanner-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "1aa536ca1c95b5dff97ce785deb114b72d51aa191fb45ffad1d145cf81f5f672e6eb4160c0de9857b5854187caaa9187ab251a8111edd9178fdb6bf0b2443749"

RPROVIDES:${PN} += "osv-scanner osv-scanner(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
