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

RPM_NAME = "trivy-0.41.0-1.1.aarch64.rpm"
RPM_HASH = "1a0978c3d6a2467d1a5e325ee60ce552df9a8f81c1fdad2c2798a1cd5ecfad5d0dd30e8c3f07810c2a849e140fadb9998138bb69c46c853f2bc5e2cb6923591f"

RPROVIDES:${PN} += "trivy trivy(aarch-64)"
RDEPENDS:${PN} += "ca-certificates git-core rpm"

inherit rpm
