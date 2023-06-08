SUMMARY = "Kubernetes daemonset to perform safe automatic node reboots"
DESCRIPTION = "Kured (KUbernetes REboot Daemon) is a Kubernetes daemonset that \
performs safe automatic node reboots when the need to do so is \
indicated by the package management system of the underlying OS. \
 \
- Watches for the presence of a reboot sentinel e.g. /var/run/reboot-required \
 \
- Utilises a lock in the API server to ensure only one node reboots at a time \
 \
- Optionally defers reboots in the presence of active Prometheus alerts \
 \
- Cordons & drains worker nodes before reboot, uncordoning them after"
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kured-1.10.2-1.3.aarch64.rpm"
RPM_HASH = "2bc08d14c2dc708cfd16473faf3e9246819ff3099c3b376d67bc34c2488a7b738ac9bca41c3052db80864d7f98d858f759059d4eb4b88bc3987113ceab8fa772"

RPROVIDES:${PN} += "kured kured(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
