SUMMARY = "Passenger Nginx module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the nginx sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-nginx-6.0.17-1.5.aarch64.rpm"
RPM_HASH = "7e8d42d129718f02208ad742d5a2cc94b9fa1bc5084c90b9d4a9a8d2218333e7cc2e0eeb20de643fa6d12cba7193b583a39305c6a2e4e7997dc1b9b39ae0964d"

RPROVIDES:${PN} += "config(rubygem-passenger-nginx) rubygem-passenger-nginx rubygem-passenger-nginx(aarch-64)"
RDEPENDS:${PN} += "nginx rubygem-passenger"

inherit rpm
