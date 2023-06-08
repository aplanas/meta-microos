SUMMARY = "Extract distribution name and version from a distribution filename"
DESCRIPTION = "Many online services that are centered around CPAN attempt to associate \
multiple uploads by extracting a distribution name from the filename of the \
upload. For most distributions this is easy as they have used \
ExtUtils::MakeMaker or Module::Build to create the distribution, which \
results in a uniform name. But sadly not all uploads are created in this \
way. \
 \
'CPAN::DistnameInfo' uses heuristics that have been learnt by the \
http://search.cpan.org/ manpage to extract the distribution name and \
version from filenames and also report if the version is to be treated as a \
developer release \
 \
The constructor takes a single pathname, returning an object with the \
following methods \
 \
* cpanid \
 \
  If the path given looked like a CPAN authors directory path, then this \
  will be the the CPAN id of the author. \
 \
* dist \
 \
  The name of the distribution \
 \
* distvname \
 \
  The file name with any suffix and leading directory names removed \
 \
* filename \
 \
  If the path given looked like a CPAN authors directory path, then this \
  will be the path to the file relative to the detected CPAN author \
  directory. Otherwise it is the path that was passed in. \
 \
* maturity \
 \
  The maturity of the distribution. This will be either 'released' or \
  'developer' \
 \
* extension \
 \
  The extension of the distribution, often used to denote the archive type \
  (e.g. 'tar.gz') \
 \
* pathname \
 \
  The pathname that was passed to the constructor when creating the object. \
 \
* properties \
 \
  This will return a list of key-value pairs, suitable for assigning to a \
  hash, for the known properties. \
 \
* version \
 \
  The extracted version"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-CPAN-DistnameInfo-0.12-13.26.noarch.rpm"
RPM_HASH = "0100bcba7cafffb63d18339b263ff87e34eba529c0bab6548c87feb8617838b36fa028e633ca736e0547afd06ce81c675060320f86cf7f640a0aed1dbaafa1d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::DistnameInfo) perl-CPAN-DistnameInfo"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
