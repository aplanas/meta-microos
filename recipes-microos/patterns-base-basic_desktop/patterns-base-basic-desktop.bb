SUMMARY = "A very basic desktop (previously part of x11 pattern)"
DESCRIPTION = "This pattern installs a rather basic desktop (icewm)"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-basic_desktop-20200505-41.1.aarch64.rpm"
RPM_HASH = "d4ef8eb62266ec3da18f64856e960e96706751dc96f9fa3732853ab998c1e19a3fc73381331818568f2f966fd33c830d991274c6bae09debca7fcedcafee668a"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-basic_desktop patterns-base-basic_desktop(aarch-64)"
RDEPENDS:${PN} += "icewm-default icewm-theme-branding pattern()"

inherit rpm
