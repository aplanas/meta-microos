SUMMARY = "A very basic desktop (previously part of x11 pattern)"
DESCRIPTION = "This pattern installs a rather basic desktop (icewm)"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-basic_desktop-20200505-40.1.aarch64.rpm"
RPM_HASH = "ef45d78ddcc67ffa6ddaf47f61f2faf6dd5d43f60b6a8bbabe7f314c852903d33bcfad8ed48d30cb216b9c0f9d818121bedd84ca29d637f007ba825cf6fad7bb"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-basic_desktop patterns-base-basic_desktop(aarch-64)"
RDEPENDS:${PN} += "icewm-default icewm-theme-branding pattern()"

inherit rpm
