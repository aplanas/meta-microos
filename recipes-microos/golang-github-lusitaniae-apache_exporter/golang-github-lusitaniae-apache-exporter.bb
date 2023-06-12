SUMMARY = "Apache Exporter for Prometheus"
DESCRIPTION = "Exports apache mod_status statistics via HTTP for Prometheus consumption."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "golang-github-lusitaniae-apache_exporter-0.11.0-5.3.aarch64.rpm"
RPM_HASH = "6ee1f7fe5520357c82804ce60ae41be5893f4cd4a1519e68108b9d638b4972567a83f4e9af030c50626efaf0ee2ef02ae7e7763bd6e324d85b78122fbc29ebeb"

RPROVIDES:${PN} += "config(golang-github-lusitaniae-apache_exporter) \
golang-github-lusitaniae-apache_exporter \
golang-github-lusitaniae-apache_exporter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
shadow \
systemd"

inherit rpm
