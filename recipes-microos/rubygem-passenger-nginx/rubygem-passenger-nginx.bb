SUMMARY = "Passenger Nginx module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the nginx sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-nginx-6.0.17-1.4.aarch64.rpm"
RPM_HASH = "3f03671d21d2ec0b1777aaa0821fa9aec0f78ebaf88b85a1f8392301ae47ae2d94414d6643825f3e15972aef05aa01774659952216c2f2db978fda6d8e8c56ed"

RPROVIDES:${PN} += "config(rubygem-passenger-nginx) rubygem-passenger-nginx rubygem-passenger-nginx(aarch-64)"
RDEPENDS:${PN} += "nginx rubygem-passenger"

inherit rpm
