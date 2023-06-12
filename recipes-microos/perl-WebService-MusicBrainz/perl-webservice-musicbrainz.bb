SUMMARY = "Web service API to MusicBrainz database"
DESCRIPTION = "API to search the musicbrainz.org database"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.6"

RPM_NAME = "perl-WebService-MusicBrainz-1.0.6-1.2.noarch.rpm"
RPM_HASH = "132454fca748e3abfaff4a4c4377c4c8256949e0baa419431c5a5f930753da7e42edb6edc2c0670ecebdc5bc299811b6e103ffe938b2a140370d579f5e3e7103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(WebService::MusicBrainz) \
perl(WebService::MusicBrainz::Request) \
perl-WebService-MusicBrainz"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Mojolicious)"

inherit rpm
