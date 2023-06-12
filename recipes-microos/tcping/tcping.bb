SUMMARY = "A ping program for TCP ports"
DESCRIPTION = "TCPing will send TCP probes to an IP address or a hostname specified \
by you and prints the result. \
It works with both IPv4 and IPv6. \
 \
TCPING uses different TCP sequence numbering for successful and \
unsuccessful probes, so that when you look at the results and spot \
a failed probe, understanding the total packet drops to that point \
would be illustrative enough. \
 \
 * Monitor your network connection. \
 * Determine packet loss. \
 * Analyze the network's latency. \
 * Show min/avg/max probes latency. \
 * Use the -r flag to retry hostname resolution after a predetermined \
   number of ping failures. If you want to test your DNS load \
   balancing or Global Server Load Balancer (GSLB), you should \
   utilize this option.. \
 * Print connection statistics on Enter key press. \
 * Display the longest encountered downtime and uptime duration and \
   time. \
 * Monitor and audit your peers network. \
 * Calculate the total uptime/downtime when conducting a maintenance. \
 * An alternative to ping in environments that ICMP is blocked."
LICENSE = "MIT"

PV = "1.19.2"

RPM_NAME = "tcping-1.19.2-1.2.aarch64.rpm"
RPM_HASH = "445b7e292b76195125ba42014a72ce029f7b76a9cda46c52d81c34d08ec8ad28815cf59cf784939bffe363c394efd532aac78e81c3ff1a89f0c73bd0e36fc08f"

RPROVIDES:${PN} += "tcping tcping(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
