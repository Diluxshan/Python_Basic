import gmail
import time


# GPIO.setwarnings(False)
# GPIO.setmode(GPIO.BCM) # tell the Pi what headers to use
# GPIO.setup(14, GPIO.OUT) # tell the Pi this pin is an output

g = gmail.login('dilux@gmail.com', '123456')
unread_messages = g.inbox().mail(unread=True)
total_messages = 0

for message in unread_messages:
	total_messages += 1

if total_messages > 0:
	# there are unread emails, turn light on
	# GPIO.output(14, True)
	print('You have unread messaages....!')

else:
	# there are no unread emails, turn light off
	# GPIO.output(14, False)
	print('All the messages are read...!')


cd