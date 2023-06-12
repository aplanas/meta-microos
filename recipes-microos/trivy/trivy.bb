SUMMARY = "A Simple and Comprehensive Vulnerability Scanner for Containers"
DESCRIPTION = "Trivy (`tri` pronounced like trigger, `vy` pronounced like envy) is a simple and \
comprehensive vulnerability scanner for containers and other artifacts. A \
software vulnerability is a glitch, flaw, or weakness present in the software or \
in an Operating System. Trivy detects vulnerabilities of OS packages (Alpine, \
RHEL, CentOS, etc.) and application dependencies (Bundler, Composer, npm, yarn, \
etc.). Trivy is easy to use. Just install the binary and you're ready to \
scan. All you need to do for scanning is to specify a target such as an image \
name of the container."
LICENSE = "Apache-2.0"

PV = "0.41.0"

RPM_NAME = "trivy-0.41.0-2.1.aarch64.rpm"
RPM_HASH = "4b8ee289c245978f7ac9bee370575ab2e688c2e6d0339a4a5abc27b42f28e4757d5094e2219ff6187000a55b741c8abd807ca38e277f407a0f13b8ff9a578eaa"

RPROVIDES:${PN} += "trivy trivy(aarch-64)"
RDEPENDS:${PN} += "ca-certificates git-core libc.so.6(GLIBC_2.34)(64bit) rpm"

inherit rpm
