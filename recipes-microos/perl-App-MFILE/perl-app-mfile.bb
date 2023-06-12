SUMMARY = "MFILE shared modules"
DESCRIPTION = "This distro consists of general, reusable modules. Currently, there is only \
one module, App::MFILE::HTTP, which is used by App::MFILE::WWW, \
App::Dochazka::WWW, and App::Dochazka::CLI."
LICENSE = "BSD-3-Clause"

PV = "0.182"

RPM_NAME = "perl-App-MFILE-0.182-1.19.noarch.rpm"
RPM_HASH = "76c9832b2e33446ac730800c89a5a76c8f7889e1f9960b2672d392905bc4892a142d52f7d290b0dd7a9725f78e2cb3bcec5883c6c32df30e982da0e180a0a49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::MFILE) \
perl(App::MFILE::HTTP) \
perl-App-MFILE"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(App::CELL) \
perl(HTTP::Request::Common) \
perl(JSON) \
perl(LWP::UserAgent) \
perl(Params::Validate)"

inherit rpm
