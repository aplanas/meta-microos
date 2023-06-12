SUMMARY = "Print out each line before it is executed (like C<sh -x>)"
DESCRIPTION = "If you run your program with 'perl -d:Trace program', this module will \
print a message to standard error just before each line is executed. For \
example, if your program looks like this: \
 \
         \
 \
 \
        print 'Statement 1 at line 4\\n'; \
        print 'Statement 2 at line 5\\n'; \
        print 'Call to sub x returns ', &x(), ' at line 6.\\n'; \
 \
        exit 0; \
 \
 \
        sub x { \
          print 'In sub x at line 12.\\n'; \
          return 13; \
        } \
 \
Then the 'Trace' output will look like this: \
 \
        >> ./test:4: print 'Statement 1 at line 4\\n'; \
        >> ./test:5: print 'Statement 2 at line 5\\n'; \
        >> ./test:6: print 'Call to sub x returns ', &x(), ' at line 6.\\n'; \
        >> ./test:12:   print 'In sub x at line 12.\\n'; \
        >> ./test:13:   return 13; \
        >> ./test:8: exit 0; \
 \
This is something like the shell's '-x' option."
LICENSE = "SUSE-Public-Domain"

PV = "0.12"

RPM_NAME = "perl-Devel-Trace-0.12-1.23.noarch.rpm"
RPM_HASH = "68c4b71a9bd9197564ef35a0f9d5f319f1d38d0b0da9b94b94b934a90e1cdd5b6a776aaa346cd0e83e2b7dfe84bc59c14cc48c4607da269f6b7cd25589e205bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::Trace) \
perl-Devel-Trace"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
