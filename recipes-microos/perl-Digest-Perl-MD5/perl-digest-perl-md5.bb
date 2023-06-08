SUMMARY = "Perl implementation of Ron Rivests MD5 Algorithm"
DESCRIPTION = "This modules has the same interface as the much faster 'Digest::MD5'. So \
you can easily exchange them, e.g. \
 \
	BEGIN { \
	  eval { \
	    require Digest::MD5; \
	    import Digest::MD5 'md5_hex' \
	  }; \
	  if ($@) { # ups, no Digest::MD5 \
	    require Digest::Perl::MD5; \
	    import Digest::Perl::MD5 'md5_hex' \
	  } \
	} \
 \
If the 'Digest::MD5' module is available it is used and if not you take \
'Digest::Perl::MD5'. \
 \
You can also install the Perl part of Digest::MD5 together with \
Digest::Perl::MD5 and use Digest::MD5 as normal, it falls back to \
Digest::Perl::MD5 if it cannot load its object files. \
 \
For a detailed Documentation see the 'Digest::MD5' module."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.9"

RPM_NAME = "perl-Digest-Perl-MD5-1.9-3.26.noarch.rpm"
RPM_HASH = "9723fce6fdaebe02511e9699f85a8c2c696a2ef45aaf1c7820d6faf312cd8fd94b904aa8c89c653a2e82a3e2bf621a3a897476a60df832587e1209b238ecf669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Digest::Perl::MD5) perl-Digest-Perl-MD5"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
