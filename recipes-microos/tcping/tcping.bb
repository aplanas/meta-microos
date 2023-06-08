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

RPM_NAME = "tcping-1.19.2-1.1.aarch64.rpm"
RPM_HASH = "db3e7357fc7c6e91994d43cc0f211df23e28341bb930802e18776aa52dd21cf5348131a1b6dfb05d7d8a3b50328b201a95fecb0e676dc2b20b79ce386631a189"

RPROVIDES:${PN} += "tcping tcping(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
