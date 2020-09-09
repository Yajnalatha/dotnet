// Below methods are used to scan the git code repo.
def AllowedPattern() {
        sh '''
        git secrets --add --allowed --literal 'ex@mplepassword'
		git secrets --add --allowed --literal '^$'
		git secrets --add --allowed --literal 'sooper secret'
		git secrets --add --allowed --literal 'process.env.MYSQL_ENV_MYSQL_ROOT_PASSWORD'
		git secrets --add --allowed --literal 'otpauth://totp/{0}:{1}?secret={2}&issuer={0}&digits=6'
		'''
}

return this // this is important to return

