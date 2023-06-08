SUMMARY = "Perl/Mapscript map making extensions to Perl"
DESCRIPTION = "The Perl/Mapscript extension provides full map customization capabilities \
within the Perl programming language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "perl-mapscript-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "14fde29f921308c0406cb1b05fd7cd910e95648cfeda77072688f2742a75ac5fb8f1030a2524bb57c6b45de05cc5cdab182292fce3424f035562cda2a1da7dbe"

RPROVIDES:${PN} += "mapserver-perl perl(mapscript) perl(mapscript::CompositingFilter) perl(mapscript::DBFInfo) perl(mapscript::LayerCompositer) perl(mapscript::OWSRequest) perl(mapscript::classObj) perl(mapscript::clusterObj) perl(mapscript::colorObj) perl(mapscript::configObj) perl(mapscript::errorObj) perl(mapscript::fontSetObj) perl(mapscript::hashTableObj) perl(mapscript::imageObj) perl(mapscript::intarray) perl(mapscript::labelCacheMemberObj) perl(mapscript::labelCacheObj) perl(mapscript::labelCacheSlotObj) perl(mapscript::labelLeaderObj) perl(mapscript::labelObj) perl(mapscript::layerObj) perl(mapscript::legendObj) perl(mapscript::lineObj) perl(mapscript::mapObj) perl(mapscript::markerCacheMemberObj) perl(mapscript::outputFormatObj) perl(mapscript::pointObj) perl(mapscript::projectionObj) perl(mapscript::queryMapObj) perl(mapscript::rectObj) perl(mapscript::referenceMapObj) perl(mapscript::reprojectionObj) perl(mapscript::resultCacheObj) perl(mapscript::resultObj) perl(mapscript::scaleTokenEntryObj) perl(mapscript::scaleTokenObj) perl(mapscript::scalebarObj) perl(mapscript::shapeObj) perl(mapscript::shapefileObj) perl(mapscript::styleObj) perl(mapscript::symbolObj) perl(mapscript::symbolSetObj) perl(mapscript::webObj) perl(mapscriptc) perl-mapscript perl-mapscript(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmapserver.so.2()(64bit) libmapserver2 libperl.so()(64bit) perl-base"

inherit rpm
