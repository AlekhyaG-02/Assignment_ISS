// Array to store tasks
let tasks = [];

// Function to add a new task
function addTask() {
  const newTaskInput = document.getElementById('newTask');
  const taskText = newTaskInput.value.trim();

  if (taskText !== '') {
    tasks.push({ text: taskText, completed: false });
    displayTasks();
    newTaskInput.value = '';
  }
}

// Function to toggle task completion
function toggleTask(index) {
  tasks[index].completed = !tasks[index].completed;
  displayTasks();
}

// Function to remove a task
function removeTask(index) {
  tasks.splice(index, 1);
  displayTasks();
}

// Function to display tasks in the UI
function displayTasks() {
  const taskList = document.getElementById('taskList');
  taskList.innerHTML = '';

  tasks.forEach((task, index) => {
    const li = document.createElement('li');
    const checkbox = document.createElement('input');
    checkbox.type = 'checkbox';
    checkbox.checked = task.completed;
    checkbox.addEventListener('change', () => toggleTask(index));

    const taskText = document.createElement('span');
    taskText.textContent = task.text;
    if (task.completed) {
      taskText.classList.add('completed');
    }

    const removeButton = document.createElement('button');
    removeButton.textContent = 'Remove';
    removeButton.addEventListener('click', () => removeTask(index));

    li.appendChild(checkbox);
    li.appendChild(taskText);
    li.appendChild(removeButton);

    taskList.appendChild(li);
  });
}

// Initial display of tasks
displayTasks();
